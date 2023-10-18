import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ControlePonto {
    public RegistroPonto registro;

    public ControlePonto(){
        Random rand = new Random();
        registro = new RegistroPonto();
        registro.setIdRegPonto(rand.nextInt());
        registro.setDataRegistro(java.time.LocalDate.now());

    }
    public String registraEntrada( Funcionario f){
        LocalDateTime Data = java.time.LocalDateTime.now();
        registro.setHoraEntrada(Data);
        registro.setFunc(f);
        return Data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public String registrarSaida(Funcionario f){
        LocalDateTime Data = java.time.LocalDateTime.now();
        registro.setHoraSaida(Data);
        return Data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }


}
