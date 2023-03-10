import java.util.ArrayList;


public class Main {
    public static void main(String[] args)
    {
        String name = "Nathan";
        int cnt = 0;
        int countDown;
        int randomNumber;
        System.out.println("Hello "+name+"\n");

        String[] courses = {"Math", "Grammar", "Vocab", "Science"};
        String[] courses2 = new String[5];
        courses2[0] = "French";
        courses2[1] = "English";
        courses2[2] = "Spanish";
        courses2[3] = "German";
        courses2[4] = "Chinese";

        System.out.println(name+" IS TAKING THE FOLLOWING COURSES");

        for (int i=0; i < courses.length; i++)
        {
            System.out.println(courses[i]);
        }

        System.out.println("\nWHILE LOOP EXAMPLE");
        System.out.println("\n"+name+" IS TAKING THE FOLLOWING COURSES");

        /* cnt is Declared and Initialized at the beginning of the function */
        while (cnt < courses2.length)
        {
            System.out.println(courses2[cnt]);
            cnt++;
        }

        System.out.println("\nPRINTING ARRAY BACKWARDS EXAMPLE");
        System.out.println("Printing "+name+"'s Course List Backwards");

        /* countDown is Declared at the top of the function
        NOTE: courses.length gets the number of elements in the array, however array's start at 0.
        Instead of setting countDown = courses.length - 1, whenever the corresponding element in the
        courses Array needs to be accessed, subtract 1 from countDown before using it.

        Example Table
        Xth element | Array Position |
            1st     |       0        |
            2nd     |       1        |
            ...     |      ...       |
            Xth     |      X-1       |
        */
        for (countDown = courses.length; countDown > 0; countDown--)
        {
            System.out.println(courses[countDown - 1]);
        }

        ArrayList<String> classes = new ArrayList<>();
        classes.add("PROG1400");
        classes.add("PROG2700");
        classes.add("PROG2007");
        classes.add("SAAD1001");

        System.out.println("\nPrinting Class List, created with ArrayList");
        System.out.println(classes);

        System.out.println("\n\nDIFFERENCE BETWEEN PRINTLN VS PRINT - EXAMPLE");

        for (int currentArrayIndex = 0; currentArrayIndex < classes.size(); currentArrayIndex++)
        {
            System.out.println("\nPrinting "+ classes.get(currentArrayIndex)+" String Reversed on a single line");
            for (int currentStringIndex = classes.get(currentArrayIndex).length(); currentStringIndex > 0; currentStringIndex--)
            {
                System.out.print(classes.get(currentArrayIndex).charAt(currentStringIndex - 1) );
            }

            if (currentArrayIndex == classes.size() - 1)
            {
                System.out.println("\nCOMPLETED classes.get("+currentArrayIndex+") - Reached the End of the ArrayList classes ");
            }
            else {
                System.out.println("\nCOMPLETED classes.get("+currentArrayIndex+") NEXT ELEMENT is at classes.get("+(currentArrayIndex+1)+")");
            }
        }

        System.out.println("\nThe index of \"PROG1400\" is:"+ classes.indexOf("PROG1400") );

        if (!classes.contains("PROG2007"))
        {
            System.out.println("Classes does NOT contain PROG2007");
        }
        else
        {
            System.out.println("Classes DOES contain PROG2007");
        }


        ArrayList<Integer> grades = new ArrayList<Integer>();

        for (int index = 0; index < classes.size(); index++)
        {
            grades.add((int)(Math.random() * 99 + 1));
        }
        System.out.println(grades);
        /*
        System.out.println("REMOVING ELEMENTS FROM ARRAYLIST EXAMPLE");
        System.out.println(classes);
        System.out.println("REMOVING \"PROG2700\" FROM classes");
        classes.remove("PROG2700");
        System.out.println(classes);
        System.out.println("DO NOTE THAT REMOVING \"PROG2700\" did NOT leave an empty value in the array");
        System.out.println("REMOVING index \"2\" FROM classes");
        classes.remove(2);
        System.out.println(classes);
         */

    }
}