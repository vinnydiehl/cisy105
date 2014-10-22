require "nutella"

require_relative "instructor"
require_relative "textbook"

class Course
  attr_reader :name, :id, :instructor, :textbook

  def initialize(name, id, instructor, textbook)
    @name, @id, @instructor, @textbook = name, id, instructor, textbook
  end

  def to_s
    <<-EOS.heredoc.strip
      Course Name: #{@name}
      Course ID: #{@id}
      Instructor Information:
      #{@instructor.to_s}
      Textbook Information:
      #{@textbook.to_s}
    EOS
  end
end
