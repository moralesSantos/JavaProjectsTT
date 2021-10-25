var map;
var coords = {lat: 36.0679, lng: -79.4004};


function initMap() {
    map = new google.maps.Map(document.getElementById('map'), {
        center: coords,
        zoom: 10,
        scrollwheel: true
    });

    var image = {
        url: '/turtle.png',
        scaledSize: new google.maps.Size(50, 50)
    }

    var marker = new google.maps.Marker({
    position: coords,
    map:map,
    icon:image,
    animation:google.maps.Animation.BOUNCE
    });

    var contentString = '<h2>Graham, NC</h2> <p>Where your dreams come true.</p>';

     var infowindow = new google.maps.InfoWindow({
       content: contentString
     });

     google.maps.event.addListener(marker, 'click', function() {
        infowindow.open(map,marker);
     });

    }