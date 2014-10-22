require "nutella"

class Textbook
  def initialize(title, author, publisher)
    set title, author, publisher
  end

  def set(title, author, publisher)
    @title, @author, @publisher = title, author, publisher
  end

  def to_s
    <<-EOS.heredoc.strip
      Title:     #{@title}
      Author:    #{@author}
      Publisher: #{@publisher}
    EOS
  end
end
