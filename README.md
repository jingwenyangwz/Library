# Library
- Implement a library book index database
  - Books have the following properties (fields): Author, Title, Location
  -  There is a modern database, with data stored in a computer, one
object for each book, with the above fields
  -  There is a legacy paper-based index card database. Represent these
with strings corresponding to index cards, storing data as follows:
author|title|location
  -  When we are trying to find a book in the library by either title or
author, we have to look through both databases - but the objects
representing index cards don’t give direct access to the three fields,
rather the string in the above format needs to be parsed
  -  Use the adapter pattern to adapt index-card books to use the same
interface as books in the modern database
  -  This enables searching through both databases as a single database (the
search is the client)
  -  Fill up the databases with random data, and perform a few queries
