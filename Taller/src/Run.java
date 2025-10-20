import Interfaz.Menu;
import Logica.DoublyLinkedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author crist
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        try (BufferedReader br = new BufferedReader(new FileReader("numeros.txt"))) {
            String line = br.readLine();
            if (line != null) {
                String[] numbers = line.split(",");
                for (String num : numbers) {
                    list.add(Integer.parseInt(num.trim()));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // aqui se lanza la interfaz grafica
        java.awt.EventQueue.invokeLater(() -> {
            Menu menu = new Menu(list);
            menu.setVisible(true);
        });
    }

}
