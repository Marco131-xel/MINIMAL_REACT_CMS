function loadPage(page) {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', page + '.html', true);
    xhr.onload = function () {
        if (xhr.status == 200) {
            document.getElementById('content').innerHTML = xhr.responseText;
        } else {
            document.getElementById('content').innerHTML = '<h2>Error al cargar la pagina</h2>';
        }
    };
    xhr.send();
}
