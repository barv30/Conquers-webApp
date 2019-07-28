package Server.Servlets.GameRoomServlets;

import EnginePack.GameEngine;
import EnginePack.UnitToBuy;
import Games.GamesManager;
import Server.Utils.ServletUtils;
import Server.Utils.SessionUtils;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

@WebServlet(name = "HaveMoneyToBuyServlet", urlPatterns = {"/pages/GameRoom/moneyToBuy"})
public class HaveMoneyToBuyServlet extends HttpServlet {

    // urls that starts with forward slash '/' are considered absolute
    // urls that doesn't start with forward slash '/' are considered relative to the place where this servlet request comes from
    // you can use absolute paths, but then you need to build them from scratch, starting from the context path
    // ( can be fetched from request.getContextPath() ) and then the 'absolute' path from it.
    // Each method with it's pros and cons...
    // must start with '/' since will be used in request dispatcher...
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Gson gson = new Gson();
        PrintWriter out = response.getWriter();
        String userNameFromSession = SessionUtils.getUsername(request);
        response.setContentType("application/json");
        GamesManager gamesManager = ServletUtils.getGamesManager(getServletContext());
        GameEngine gameEngine=gamesManager.findGameController((String)(request.getSession(false).getAttribute("gameName"))).getGameEngine();

        ArrayList<UnitToBuy> unitsToBuy1=new ArrayList<UnitToBuy>();

        //String[] array=(String[])(request.getSession(false).getAttribute("unitsToBuy"));
        String[] array1=request.getParameterValues("json[]");


        for(int i=0;i<gameEngine.getNumberOfTypesUnit();i++)
        {
            String type= gameEngine.getInfoArmy().get(i).getType();
            int amount=parseInt(array1[i]);

            UnitToBuy u=new UnitToBuy(type,amount);
            unitsToBuy1.add(u);
        }

        gameEngine.checkIfPlayerHaveTuringsToBuy(gameEngine.getCurrentPlayer(),unitsToBuy1);

        out.println(gson.toJson(gameEngine));
    }
//we need to check in all servelt if doesnt have session move him to index page.
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}