package conversorjavaalura.model;
import conversorjavaalura.enums.Moneda;
import java.math.BigDecimal;

public class ConvertidorDeMonedaDolar extends ConvertidorDeMoneda{
    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorReal) {
        moneda = Moneda.DOLAR;
        return super.convertirParaMoneda(moneda, valorReal);
    }
    @Override
    public BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorMoneda) {
        moneda = Moneda.DOLAR;
        return super.convertirParaReal(moneda, valorMoneda);
    }
}
