# Zuul server for Pet Clinic project

It provides routing abilities for calls from UI.
Repository: https://github.com/Andrei-Khadziukou/petclinic-zuul.

After running this server calls to this application will be redirected to services
* `http://<server-host>:<server-port>/api/orders` will be redirected to `ORDER_SERVICE`
* `http://<server-host>:<server-port>/api/services` will be redirected to `CLIENT_SERVICE`
* `http://<server-host>:<server-port>/api/animals` will be redirected to `CLIENT_SERVICE`
* `http://<server-host>:<server-port>/api/clinics` will be redirected to `CLIENT_SERVICE`

**See details about ORDER_SERVICE and CLIENT service in Eureka Pet Client** (https://github.com/Andrei-Khadziukou/petclinic-eureka).
