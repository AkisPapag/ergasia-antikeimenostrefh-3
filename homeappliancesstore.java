public class homeappliancesstore {
    static String  onomaetairias ;
    static String  dieuthinsh ;
    static int plithos ;

    public static void main(String[]args){
        getset antikeimeno= new getset();
        antikeimeno.setOnomaetairias(args[0]);
        antikeimeno.setDieuthinsh(args[1]);
        antikeimeno.setPlithos(Integer.parseInt(args[2]));
        System.out.println("getset.onoma = " + antikeimeno.getOnomaetairias() + '\n' + "getset.dieunthish = " + antikeimeno.getDieuthinsh() + '\n' + "getset.plithos = " + antikeimeno.getPlithos());
        onomaetairias= args[0];
        dieuthinsh= args[1];
        plithos=Integer.parseInt(args[2]);
        if (onomaetairias==null){
            System.out.println("lathos onomaetaιrias");
        }
        if (dieuthinsh==null) {
            System.out.println("lathos dieuthinsh");
        }
        System.out.println("onoma = " + onomaetairias + '\n' + "dieunthish = " + dieuthinsh + '\n' + "plithos = " + plithos);


    }


}
