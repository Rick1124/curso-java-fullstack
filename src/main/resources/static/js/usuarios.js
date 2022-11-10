// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios()
  $('#usuarios').DataTable();
});

async function cargarUsuarios() {

  const request = await fetch('usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const usuarios = await request.json();

  console.log(usuarios);

  let usuario = '                                        <tr>\n' +
      '                                            <td>123</td>\n' +
      '                                            <td>Prueba Moy</td>\n' +
      '                                            <td>lucasmoy@hotmail.com</td>\n' +
      '                                            <td>23423423</td>\n' +
      '                                            <td>\n' +
      '                                                <a href="#" class="btn btn-danger btn-circle btn-sm">\n' +
      '                                                    <i class="fas fa-trash"></i>\n' +
      '                                                </a>\n' +
      '                                            </td>\n' +
      '                                        </tr>'

  document.querySelector("#usuarios tbody").outerHTML = usuario;

}
