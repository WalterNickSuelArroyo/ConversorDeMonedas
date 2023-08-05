package conversorjavaalura.model;
import conversorjavaalura.enums.Moneda;
import java.math.BigDecimal;

public class ConvertidorDeMonedaLibraEsterlina extends ConvertidorDeMoneda{
    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorReal) {
        moneda = Moneda.LIBRA_ESTERLINA;
        return super.convertirParaMoneda(moneda, valorReal);
    }
    @Override
    public BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorMoneda) {
        moneda = Moneda.LIBRA_ESTERLINA;
        return super.convertirParaReal(moneda, valorMoneda);
    }
}
