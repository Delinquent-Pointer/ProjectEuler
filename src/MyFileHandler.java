import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileHandler {

  private String filePath;

  // Constructor to set the file path when creating an instance
  public MyFileHandler(String fileName) {
    // Use absolute path based on the current working directory
    this.filePath = "data/" + fileName;
  }

  // Method to open the file
  public void open() {
    if (filePath == null || filePath.isEmpty()) {
      throw new IllegalArgumentException("File path cannot be null or empty");
    }
    // Perform other operations related to opening the file if needed
  }

  // Method to read and print the content of the file
  public void printContent() {
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
      // Handle the exception according to your application's requirements
    }
  }

  // Method to parse the content of the file
  public void parse() {
    // Add your parsing logic here
  }

  public static void main(String[] args) {
    String fileName = "problem8.txt";
    MyFileHandler fileHandler = new MyFileHandler(fileName);

    try {
      fileHandler.open();
      fileHandler.printContent(); // New method to print the content
      fileHandler.parse();
    } catch (Exception e) {
      e.printStackTrace();
      // Handle the exception according to your application's requirements
    } finally {
      // Close any resources if needed
    }
    int tempMaxProduct = 0;
    int[] tempProducts = new int[4];

    final int numRows = 20;
    final int numCols = 20;
    int[][] matrix = new int[numRows][numCols];
    for(int r = 0; r <numRows; r++){
      for(int c = 0; c < numCols; c++){
        matrix[r][c] = .nextInt();
      }
    }

  }
}
