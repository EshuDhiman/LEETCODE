class Solution {
    public String interpret(String command) {
       if(command.contains("()")||command.contains("(al)")){
         command =   command.replace("()", "o");
            command =command.replace("(al)", "al");

        }
       
        return command;
        
    }
}