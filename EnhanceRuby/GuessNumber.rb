 #author:L.P
 #time:201510022244
 #Main: Guess a number
=begin
6.Bonus problem: If you‘re feeling the need for a little more, write a program that picks a random number. 
   Let a player guess the number, telling the player whether the guess is too low or too high.
   (Hint: rand(10)  will generate a random number from 0 to 9, and gets  will read a string from the keyboard
   that you can translate to an integer.)

=end
 require 'debase/ruby_core_source'
puts "Guess a number between 0 and 9"
randomNumer = rand(10)
playerNumber = gets()
while true
    if playerNumber.to_i >randomNumer
        puts "Too Large"
    elsif playerNumber.to_i < randomNumer
        puts "Too Small"
    else
        puts "That's cool! You guess number successfully"
        exit
    end
    puts "Please guess again!"
    playerNumber = gets()


end

puts "b "

    

