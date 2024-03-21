import com.address.model.ManagerUtilisateur;
import com.address.model.Utilisateur;

import java.sql.SQLException;
import java.util.Objects;

import static com.address.model.ManagerUtilisateur.update;

public class Main {
    public static void main(String[] args) throws SQLException {
//        Utilisateur user = new Utilisateur("test", "test", "test@test.com", "1234");
//        //test si le compte exist
//        if(Objects.equals(user.getEmail(), ManagerUtilisateur.findByMail(user).getEmail())){
//            System.out.println("Le compte existe déja");
//        }
//        else{
//            //ajouter le compte en BDD
//            System.out.println(ManagerUtilisateur.create(user));
//        }


        Utilisateur user = new Utilisateur("test", "test", "test@test.com", "1234");
        //test si le compte exist
        if(Objects.equals(user.getEmail(), ManagerUtilisateur.findByMail(user).getEmail())){
            user.setName("Calimero");
            user.setFirstname("pascontent");
            System.out.println(ManagerUtilisateur.update(user));
        }
        else{
            //ajouter le compte en BDD
            System.out.println("Le compte n'existe pas");
        }

    }
}