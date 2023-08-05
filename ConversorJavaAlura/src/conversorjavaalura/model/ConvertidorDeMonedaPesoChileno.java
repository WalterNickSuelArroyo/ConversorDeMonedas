package conversorjavaalura.model;
import conversorjavaalura.enums.Moneda;
import java.math.BigDecimal;

public class ConvertidorDeMonedaPesoChileno extends ConvertidorDeMoneda{
    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorReal) {
        moneda = Moneda.PESO_CHILENO;
        return super.convertirParaMoneda(moneda, valorReal);
    }
    @Override
    public BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorMoneda) {
        moneda = Moneda.PESO_CHILENO;
        return super.convertirParaReal(moneda, valorMoneda);
    }
}
