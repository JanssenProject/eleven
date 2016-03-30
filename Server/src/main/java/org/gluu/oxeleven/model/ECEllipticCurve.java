package org.gluu.oxeleven.model;

/**
 * @author Javier Rojas Blum
 * @version March 30, 2016
 */
public enum ECEllipticCurve {

    P_256("P-256", "secp256r1", "1.2.840.10045.3.1.7"),
    P_384("P-384", "secp384r1", "1.3.132.0.34"),
    P_521("P-521", "secp521r1", "1.3.132.0.35");

    private final String name;
    private final String alias;
    private final String oid;

    private ECEllipticCurve(String name, String alias, String oid) {
        this.name = name;
        this.alias = alias;
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public String getOid() {
        return oid;
    }

    @Override
    public String toString() {
        return name;
    }
}
