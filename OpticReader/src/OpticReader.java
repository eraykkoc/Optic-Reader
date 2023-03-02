import java.util.Scanner;                                                                                           
public class OpticReader{                                                                                           
    public static void main(String[] args) {                                                                        
        Scanner scan = new Scanner(System.in);                                                                      
        System.out.print("Please enter the number of students: ");                                                  
        int numofstu = scan.nextInt();                                                                              
        System.out.print("Please enter the number of questions: ");                                                 
        int numofque = scan.nextInt();                                                                                   
	        char[][] allAnswers = new char[numofstu][numofque];                                                        
	        char[] answerKey = new char[numofque];                                                                  
	        createAnswerKey(answerKey);                                                                        
	        addAnswersofStudents(allAnswers);                                                                   
	        viewStudentAnswers(allAnswers);                                                                   
	        viewAnswerKey(answerKey);                                                                    
	        evaluateStudents(answerKey, allAnswers);                                                         
    }                                                                                                               
    private static void viewAnswerKey(char[] answerKey) {                                            
        for (char option : answerKey){                                                                         
            System.out.print(option+",");                                                                          
        }                                                                                                           
        System.out.println();                                                                                       
    }                                                                                                               
    private static void viewStudentAnswers(char[][] allAnswers) {                                         
        for (int row = 0; row < allAnswers.length; row++) {                                                  
            for (int column = 0; column < allAnswers[row].length; column++) {                                       
                System.out.print(allAnswers[row][column]+ ",");                                                   
            }                                                                                                       
            System.out.println();                                                                                   
        }                                                                                                           
    }                                                                                                               
    private static void evaluateStudents(char[] answerKey, char[][] allAnswers) {                        
        for (int row = 0; row < allAnswers.length; row++) {                                                  
            int numberofTrueAnswers = 0;                                                                               
            for (int column = 0; column < allAnswers[row].length; column++) {                                       
                if (allAnswers[row][column] == answerKey[column]) {                                            
                    numberofTrueAnswers++;                                                                             
                }                                                                                                   
            }                                                                                                       
            	if (row == 1)
            	System.out.println("1st student's number of true answers : "                               
                    +numberofTrueAnswers);
            	if (row == 2)
            	System.out.println("2nd student's number of true answers : "                               
                            +numberofTrueAnswers);	
            	if (row == 3)
                	System.out.println("3rd student's number of true answers : "                               
                                +numberofTrueAnswers);	
            	if (row >= 4)
                	System.out.println(row +"th student's number of true answers : "                               
                                +numberofTrueAnswers);	
        }                                                                                                           
    }                                                                                                               
    private static void createAnswerKey(char[] answerKey) {                                                
        for (int i = 0; i < answerKey.length; i++) {                                                            
            answerKey[i] = createAnAnswer();                                                                      
        }                                                                                                           
    }                                                                                                               
    private static void addAnswersofStudents(char[][] allAnswers) {                                         
        for (int row = 0; row < allAnswers.length; row++) {                                                  
            for (int column = 0; column < allAnswers[row].length; column++) {                                       
                allAnswers[row][column] = createAnAnswer();                                                         
            }                                                                                                       
        }                                                                                                           
    }                                                                                                               
    public static char createAnAnswer() {                                                                             
        int randomNumber = 65 + (int) (Math.random() * 5);//0 1 2 3 4                                               
        char createdOption = (char) randomNumber;                                                                 
        return createdOption;                                                                                     
                                                                                                                    
    }                                                                                                               
}                                                                                                                   