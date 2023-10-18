public class GerenciarControlePonto {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setIdFunc(1);
        g.setNome("Mario");
        g.setEmail("mario@gmail.com");
        g.setDocumento("RG");
        g.setLogin("mario123");
        g.setSenha("M@rio123");

        Operador o = new Operador();
        o.setIdFunc(2);
        o.setNome("João");
        o.setEmail("joao@gmail.com");
        o.setDocumento("RG");
        o.setValorHora(1);

        Secretaria s = new Secretaria();
        s.setIdFunc(1);
        s.setNome("Angela");
        s.setEmail("angela@gmail.com");
        s.setDocumento("RG");
        s.setRamal("6969");
        s.setTelefone("12345678");

        try{
            ControlePonto pontoGerente = new ControlePonto();
            System.out.println("Gerente Entrou " + g.getNome());
            System.out.println(pontoGerente.registraEntrada(g));

            Thread.sleep(1000);

            ControlePonto pontoTelefonista = new ControlePonto();
            System.out.println("Operador Entrou " + o.getNome());
            System.out.println(pontoTelefonista.registraEntrada(o));

            Thread.sleep(1000);

            ControlePonto pontoSecretaria = new ControlePonto();
            System.out.println("Secretaria Entrou " + s.getNome());
            System.out.println(pontoSecretaria.registraEntrada(s));

            Thread.sleep(1000);

            System.out.println("Gerente Saiu " + g.getNome());
            System.out.println(pontoGerente.registrarSaida(g));

            Thread.sleep(1000);

            System.out.println("Operador Saiu " + o.getNome());
            System.out.println(pontoTelefonista.registrarSaida(o));

            Thread.sleep(1000);

            System.out.println("Secretaria Saiu " + s.getNome());
            System.out.println(pontoSecretaria.registrarSaida(s));

            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}