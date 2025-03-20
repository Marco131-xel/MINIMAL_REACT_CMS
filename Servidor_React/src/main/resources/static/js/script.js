function loadPage(page) {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', page + '.html', true);
    xhr.onload = function () {
        if (xhr.status == 200) {
            document.getElementById('content').innerHTML = xhr.responseText;
            if (page === "solicitud") {
                iniciarWebSocket();
            }
        } else {
            document.getElementById('content').innerHTML = '<h2>Error al cargar la página</h2>';
        }
    };
    xhr.send();
}

// WebSocket
let socket;

function iniciarWebSocket() {
    if (!socket) {
        socket = new WebSocket("ws://localhost:8080/ws");

        socket.onopen = function () {
            console.log("Conectado al servidor WebSocket");
            mostrarMensaje("Servidor Conectado");
        };

        socket.onmessage = function (event) {
            console.log("Mensaje recibido:", event.data);
            mostrarMensaje(event.data);
        };

        socket.onerror = function (error) {
            console.error("Error en WebSocket:", error);
        };

        socket.onclose = function () {
            console.log("Conexión cerrada");
        };
    }
}

function mostrarMensaje(mensaje) {
    setTimeout(() => {
        let mensajesDiv = document.getElementById("mensajes");
        const p = document.createElement("p");
        p.textContent = mensaje;
        mensajesDiv.appendChild(p);
    }, 100);
}

document.addEventListener("DOMContentLoaded", () => {
    if (window.location.pathname.includes("solicitud.html")) {
        iniciarWebSocket();
    }
});
