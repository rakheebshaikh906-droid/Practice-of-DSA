package Assigment;
//https://leetcode.com/problems/goal-parser-interpretation/description/
//1678. Goal Parser Interpretation
public class GoalParser {
    static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
    static String interpret(String command){
        command=command.replace("()","o").replace("(al)","al");
        return command;
    }
}
