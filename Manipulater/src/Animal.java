import java.io.*;

public class DataManager {

  
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        dataManager.init();
    }

    public void init() {
        Row dataSet[] = new Row[13486]; // current number of rows in the dataset

        // read the data
        try ( FileReader fr = new FileReader("../SmallAreaIncomePovertyEstData.txt"))
        {
            int c;
            int i = 0;
            int j = 0;
            char rowInputs[] = new char[130]; // number of characters per row

            while((c = fr.read()) != -1) {
                rowInputs[i] = (char) c;
                i++;
                if ( c == 10) { // `32` is blank space, '10' is new line
                    dataSet[j] = new Row(rowInputs);
                    j++;
                    i = 0;
                }
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }

        // manipulate the data
        this.manipulateData(dataSet);

        // write the data
    }
