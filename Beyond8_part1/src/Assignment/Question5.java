package Assignment;

public class Question5 {
    public static void main(String[] args) {
        String name = "Aryan";
        System.out.println(name.repeat(3));

        String s2 = "\u2005 nusn  ";
        System.out.println(s2.strip());
        System.out.println(s2.trim());

        String s3="";
        String s4="   ";
        System.out.println(s3.isBlank());
        System.out.println(s4.isBlank());
        System.out.println(s3.isEmpty());
        System.out.println(s4.isEmpty());

        System.out.println(name.indent(10));
        String newstr = name.transform(s->new StringBuilder(s).reverse().toString());
        System.out.println(newstr);
        System.out.println("--------------------------");
        String s5 = "\tA\n\tb\n\tc";
        String s6 = s5.stripIndent();
        System.out.println(s6);
        String html = """
                \thello
                \tworld
                \taryan"""+ """
               \t
               
               \t\tdnindw
               \t\tdbwio""";
        String s = html.stripIndent();
        System.out.println(s);

        String s7 = "Hello \\n\\n world";
        System.out.println(s7.translateEscapes());

        String s8 = "I am Java %s".formatted("SDE TRAINEE");
        System.out.println(s8);
    }
}
