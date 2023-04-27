Feature: comprar dos articulos de la pagina blazedemo

  Scenario Outline: Realizar la compra de dos productos
    Given la pagina se encuentra estable
    When agregamos "<productos>" al carrito de compras
    And visualizamos el carrito
    And Complementamos Formulario Carrito con "<Name>""<Country>""<City>""<CreditCard>""<Month>""<Year>"
    Then se desplegara el mensaje "Thank you for your purchase!"
    Examples:
      | productos                          | Name                 | Country | City       | CreditCard | Month | Year |
      | Samsung galaxy s6,Nokia lumia 1520 | Marco Antonio Mamani | Bolivia | Santa Cruz | 4454644654 | 05    | 2025 |