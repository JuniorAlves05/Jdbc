package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.enteties.Departament;
import model.dao.enteties.Seller;

import java.util.Date;

public class Program {

    public static void main ( String [] args){

        Departament obj = new Departament(1,"Books");
        Seller seller = new Seller(21,"Bob", "bob@gmail.com", new Date(), 3000.0,obj);

        SellerDao sellerdao = DaoFactory.createSelerDao();




        System.out.println(seller);
    }
}
