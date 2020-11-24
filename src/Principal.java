public class Principal implements Callback{

    public Principal() {
        CustomThread custom = new CustomThread(this);
        custom.start();
    }
    @Override
    public void sacarPorPantalla(String printear) {
        System.out.println("Sacado mediante callback : "+printear);
    }
}
