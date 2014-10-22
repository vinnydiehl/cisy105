require "nutella"

class Instructor
  def initialize(first_name, last_name, office)
    set first_name, last_name, office
  end

  def set(first_name, last_name, office)
    @first_name, @last_name, @office = first_name, last_name, office
  end

  def to_s
    <<-EOS.heredoc.strip
      First Name: #{@first_name}
      Last Name:  #{@last_name}
      Office No.: #{@office}
    EOS
  end
end
