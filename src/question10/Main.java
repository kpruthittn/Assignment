package question10;

public class Main {
    public static void main(String[] args) {
        // REPEAT
        System.out.println("Repeat String Method");
        String str = "Lets goooooooo!! \n";
        System.out.println(str.repeat(3));
        System.out.println();

        //STRIP
        System.out.println("Strip String Method");
        String st = "\n \t It's Champions League week";
        System.out.println(st.strip());
        System.out.println();

        //isBlank
        System.out.println("isBlank String Method");
        String b = "  \t  ";
        System.out.println(b.isBlank());
        System.out.println();

        //INDENT
        System.out.println("Indent String Method");
        String i = "Let's go on trek to Kedarnath";
        System.out.println(i.indent(8));
        System.out.println();

        //TRANSFORM
        System.out.println("Transform String Method");
        String txt = " Football";
        String return_txt = txt.transform(x -> new StringBuilder(x)
                .reverse().toString());
        System.out.println(return_txt);
        System.out.println();

        //STRIP INDENT
        System.out.println("Strip Indent String Method");
        String s = "How many goals will be scored in LIV v/s RM" + "\n\tLet's count " + "\n    Goal 1 \n" + " Goal 2 " + "..........\n" + "\tPenalty Shootout";
        System.out.println(s.stripIndent());
        System.out.println();

        //TRANSLATE ESCAPES
        System.out.println("Translate Escapes String Method");
        String t = "\"Are you ready for the \\nWeekend!!\\";
        System.out.println(t);
        System.out.println();

        //FORMATTED STRING METHODS
        System.out.println("Formatted String Method");
        System.out.println(String.format("Iphone Version %s" , "14"));
        String f = """
                Recent Version of Iphone %s
                Recent Version of Iphone %s
                """;
        System.out.println(f.formatted(12,13));
    }
}
