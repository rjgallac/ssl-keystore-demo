
https://www.thomasvitale.com/https-spring-boot-ssl-certificate/

sudo apt install openssl

keytool -genkeypair -alias springboot -keyalg RSA -keysize 4096 -storetype PKCS12 -keystore springboot.p12 -validity 3650 -storepass password
keytool -list -v -keystore springboot.p12


https://localhost:8443/product
