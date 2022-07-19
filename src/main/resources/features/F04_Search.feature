@smoke
  Feature:Search By name and SKU
    Scenario: SC4- Outline 1 user could search using product name
      Given user navigate to log in page again and again
      When user enter valid email and password and submit again
      And search using product name
      Then show result

     Scenario: Outline 2 user could search for product using sku
       Given user navigate to log in page again and again
       When user enter valid email and password and submit again
       And search using product sku
       And user click product
      Then assert