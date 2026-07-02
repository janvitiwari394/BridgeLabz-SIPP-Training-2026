import java.io.*;

class SchoolResult {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt", true));

            String line;
            while ((line = br.readLine()) != null) {
                String data[] = line.split(" ");
                String name = data[0];
                int m1 = Integer.parseInt(data[1]);
                int m2 = Integer.parseInt(data[2]);

                double avg = (m1 + m2) / 2.0;
                bw.write(name + " Average: " + avg);
                bw.newLine();
            }

            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}