
public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.query("SELECT * FROM users");

        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.query("UPDATE users SET name='Max' WHERE id=1");

        System.out.println(connection1 == connection2);
    }
}


