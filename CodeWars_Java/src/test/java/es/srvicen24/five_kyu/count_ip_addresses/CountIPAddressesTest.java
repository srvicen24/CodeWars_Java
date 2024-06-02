package es.srvicen24.five_kyu.count_ip_addresses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountIPAddressesTest {

    @Test
    public void ipsBetween() throws Exception {
        assertEquals(50, CountIPAddresses.ipsBetween("10.0.0.0", "10.0.0.50"));
        assertEquals(246, CountIPAddresses.ipsBetween("20.0.0.10", "20.0.1.0"));
        assertEquals((1L << 32L) - 1L, CountIPAddresses.ipsBetween("0.0.0.0", "255.255.255.255"));
    }
}
