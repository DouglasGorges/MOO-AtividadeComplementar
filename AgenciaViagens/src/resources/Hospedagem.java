package resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;

public class Hospedagem implements I_Item {
    private String checkIn;
    private String checkOut;
    private Double precoDiaria;

    @Override
    public Double calcularPreco() throws ParseException {

        LocalDateTime dataEntrada = LocalDateTime.parse(this.checkIn, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        LocalDateTime dataSaida = LocalDateTime.parse(this.checkOut, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        return (this.precoDiaria * Duration.between(dataEntrada, dataSaida).toDays());
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public Double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(Double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }
}
