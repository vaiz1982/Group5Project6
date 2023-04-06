Feature: Search Functionality
  # "1. 'There is no product that matches the search criteria' should be displayed in the Search Results page
  #2. Searched product should be displayed in the search results"

  Scenario: Validate Search by selecting  to search in subcategories
  Given Don't enter anything into the 'Search' text box field
  When Click on the button having search icon
  And Enter any Product Name into the 'Search Criteria' text box field - <Refer Test Data>
  And Select the Parent category of the given Product Name into 'Category' dropdown field - <Refer Test Data>
  And Click on 'Search' button (Validate ER-1)
  And Select 'Search in subcategories' checkbox field
  Then Click on 'Search' button (Validate ER-2)
