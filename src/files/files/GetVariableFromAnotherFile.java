package files;

public class GetVariableFromAnotherFile {

    public static void main(String[] args){

        Pass2AnotherFile a = new Pass2AnotherFile();

        int variablefromthisfile = a.variablefromotherfile;
        System.out.println("\nThe integer from Pass2AnotherFile is: " + variablefromthisfile);
    }
}


// This file gets the data from Pass2AnotherFile.java, that is why it has the main method in l.5.  Note how you create a new instance of
// class Pass2AnotherFile and call it "a": this is the object variable, which now does the work.  The new instance "a" gets the data from
// Pass2AnotherFile, which is called variablefromotherfile, and you let the new variable "variablefromthisfile" get its value of 10.