package Application;

import Repository.Repository;
import Repository.impl.ProductRepositoryImpl;
import model.DatabaseConnection;
import model.Product;

import java.sql.Connection;
import java.sql.SQLException;

public class Main2 {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getInstance()){
            Repository<Product> repository = new ProductRepositoryImpl();
            System.out.println("~~~~ List Products for Database ~~~~");
            repository.list().stream().forEach(System.out::println);
            System.out.println("~~~~ Get by Id : 1 ~~~~");
            System.out.println(repository.byId(1).toString());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
