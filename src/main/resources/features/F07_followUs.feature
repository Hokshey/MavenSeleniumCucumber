@smoke
  Feature: F07_followUs | users could open followUs links
    #1 Facebook
    Scenario: user opens facebook link
      And user click and navigate on facebook icon
      Then assert facebook website
      #2 Twitter
      Scenario: user opens twitter link
        And user click and navigate on twitter icon
        Then assert twitter website
          #3 RSS
        Scenario: user opens rss link
          And user click and navigate on RSS icon
          Then assert RSS website
           #4 Youtube
          Scenario: user opens youtube link
            And user click and navigate on youtube icon
            Then assert youtube website