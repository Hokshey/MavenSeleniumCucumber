@smoke
  Feature:F08_WishList | users could add an item to wish list
    Scenario: user add the item 3 to wish list
      And user click on wish list item
      Then assert color

    Scenario: user save the item 3 to wish list
      And user click on wish list item
      Then assert count