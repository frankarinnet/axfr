# axfr
demonstrate interaction between AXFR and TSIG for DNSJAVA library

To run, just update the TSIG information in 'app/src/main/java/axfr/App.java' and then './gradlew run'.
Also, toggle the version of dnsjava between 1.5.3 and 1.2.0 for different behavior with large zones.

Running this is roughly equivalent to:
dig @ns0.example.com -p 53 AXFR 192.in-addr.arpa. -y hmac-sha256:your_name_here:your_key_here
