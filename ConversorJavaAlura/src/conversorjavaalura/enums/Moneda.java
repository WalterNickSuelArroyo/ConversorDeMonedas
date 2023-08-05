package conversorjavaalura.enums;
import java.math.BigDecimal;
public enum Moneda {
    DOLAR(BigDecimal.valueOf(5.30)),
    EURO(BigDecimal.valueOf(5.35)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(6.38)),
    PESO_ARGENTINO(BigDecimal.valueOf(0.041)),
    PESO_CHILENO(BigDecimal.valueOf(0.0058));
    
    private BigDecimal FACTOR_CONVERSION;

    private Moneda(BigDecimal FACTOR_CONVERSION) {
        this.FACTOR_CONVERSION = FACTOR_CONVERSION;
    }
    public BigDecimal getFACTOR_CONVERSION() {
        return FACTOR_CONVERSION;
    }   
}
