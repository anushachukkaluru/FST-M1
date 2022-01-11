name = input( "What is your name: " )
age = int( input( "How old are you: " ) ) # it returns string so make as int
year = str( ( 2022 - age ) + 100 )
print( name + " will be 100 years old in the year " + year )