public class Grades {
    class Grade
    {
        public double Grade1;
        public double Grade2;
        Grade(){
            Grade1 = 85;
            Grade2 = 92;
        }
        double GetAverage() {
            double average = (Grade1 + Grade2)/2.0;
            return average;
        }
        double Getdifference() {
            double difference =0.0;
            if(Grade1>=Grade2)
                difference = Grade1 - Grade2;
            else
                difference = Grade2 - Grade1;
            return difference;
        }
    }
    public static void main(String[] args){
        Grade G1 = new Grade();
        
        double average = G1.GetAverage();
        double difference = G1.Getdifference();
        
        System.out.println("\t\t\t Grades:");

        System.out.println("Grade1\t\tGrade2\t\tAverage\t\tDifference");

        System.out.println(G1.Grade1+ "\t\t"+ G1.Grade2+"\t\t"+average+"\t\t"+difference);
        }
    }
}
