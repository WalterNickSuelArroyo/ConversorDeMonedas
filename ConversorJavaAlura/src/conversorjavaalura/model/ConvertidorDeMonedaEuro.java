package conversorjavaalura.model;
import conversorjavaalura.enums.Moneda;
import java.math.BigDecimal;

public class ConvertidorDeMonedaEuro extends ConvertidorDeMoneda{
    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorReal) {
        moneda = Moneda.EURO;
        return super.convertirParaMoneda(moneda, valorReal);
    }
    @Override
    public BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorMoneda) {
        moneda = Moneda.EURO;
        return super.convertirParaReal(moneda, valorMoneda);
    }
}
