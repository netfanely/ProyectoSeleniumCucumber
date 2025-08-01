Feature: Buscar imágenes de Garfield en Google

  #Scenario: Usuario busca Garfield y entra a la sección Imágenes
  #  Given el usuario abre Google
  #  When el usuario busca "Garfield"
  #  And hace clic en la pestaña de Imágenes
  #  Then se muestran imágenes relacionadas a "Garfield"

  #Scenario: Usuario busca Garfield usando Firefox
  #  Given el usuario abre Google en Firefox
  #  When el usuario busca "Garfield"
  #  And hace clic en la pestaña de Imágenes
  #  Then se muestran imágenes relacionadas a "Garfield"

  Scenario: Usuario accede directamente a imágenes de Garfield
    Given el usuario abre Google en Firefox
    When el usuario abre la búsqueda directa de imágenes con la palabra "Garfield"
    Then se muestran imágenes relacionadas a "Garfield"
