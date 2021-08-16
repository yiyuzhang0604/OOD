/**
 * Represents a CommandLineParser class
 */
public class CommandLineParser {
    private static final String RESERVE = "reserve";
    private static final String SHOW = "show";
    private static final String DONE = "done";
    private static final String ERROR_MESSAGE = "Please enter \"show\", \"done\" or \"reserve (enter from 1 to 10)\"";
    private String answer;

    private static final int MIN_LEN = 1;
    private static final int MAX_LEN = 2;

    /**
     * Constructs a CommandLineParser
     * @param args passed in arguments
     */
    public CommandLineParser(String args){
        String[] info = new String[]{};
        info = args.split(" ");
        this.validateLength(info);
        this.processArgs(info);
    }

    /**
     * Get the answer
     * @return answer
     */
    public String getAnswer(){
        return answer;
    }

    /**
     * Check if the length of arguments is correct
     * @param info String array which stores the arguments
     */
    private void validateLength(String[] info){
        if(info.length < MIN_LEN || info.length > MAX_LEN){
            System.out.println(ERROR_MESSAGE);
        }
    }

    /**
     * Process arguments
     * @param info String array which stores the arguments
     */
    private void processArgs(String[] info){
        if(info.length == MIN_LEN){
            if(info[0].equals(SHOW)){
                answer = SHOW;
            }else if(info[0].equals(DONE)){
                answer = DONE;
            }else{
                System.out.println(ERROR_MESSAGE);
            }
        }else if(info.length == MAX_LEN){
            if(!info[0].equals(RESERVE)){
                System.out.println(ERROR_MESSAGE);
            }
        }
        validateNumber(info[1]);
    }

    /**
     * Check if the number is valid number
     * @param number String number from arguments
     */
    private void validateNumber(String number){
        if(!number.matches("[0-9]*")){
            System.out.println("Please enter a number from 1 to 10");
        }else if(Integer.parseInt(number) > 10) {
            System.out.println("Number is too big! Please enter a number from 1 to 10");
        }else{
            answer = number;
        }
    }

}
