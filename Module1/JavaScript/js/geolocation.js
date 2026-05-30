// Find Nearby Events

function findNearbyEvents() {

    navigator.geolocation
    .getCurrentPosition(

        position => {

            alert(

                "Latitude: " +
                position.coords.latitude +

                "\nLongitude: " +
                position.coords.longitude

            );

        },

        error => {

            alert(
                "Location Access Denied"
            );

        }

    );

}