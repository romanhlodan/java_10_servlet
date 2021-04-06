import javax.jws.soap.SOAPBinding;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {

    ArrayList<User> users = new ArrayList<User>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User roman = User.builder().id(1).Fname("Roman").Lname("Hlodan").age(24).e_mail("wwdwwk@gmail.com").education(Education.Higt).build();
        User olya = User.builder().education(Education.Higt).e_mail("wdffrff@ukr.net").age(23).Lname("Hlodan").Fname("Olya").id(2).build();
        User petro = User.builder().id(3).Fname("Petro").Lname("Ivanciv").age(25).e_mail("rflek@gmail.com").education(Education.Middle).build();
        User volod = User.builder().education(Education.Tehnic).e_mail("dfldk2@yahoo.com").age(18).Lname("Panas").Fname("Volodia").id(4).build();
        User lida = User.builder().id(5).Fname("Lida").Lname("Ciko").age(22).e_mail("krkcl5@ukr.net").education(Education.Middle).build();
        User ivan = User.builder().education(Education.Higt).e_mail("fkkfk@yahoo.com").age(25).Lname("Sabat").Fname("Ivan").id(6).build();

        users.add(roman);
        users.add(olya);
        users.add(petro);
        users.add(volod);
        users.add(lida);
        users.add(ivan);

        String pathInfo = request.getPathInfo();
        String replace = pathInfo.replace("/", "");
        int id = Integer.parseInt(replace);
        User user = users.get(id);
        request.setAttribute("q", user);
        request.getRequestDispatcher("/pages/users.jsp").forward(request, response);
    }
}
