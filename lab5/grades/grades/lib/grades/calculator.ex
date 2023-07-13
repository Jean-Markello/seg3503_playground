defmodule Grades.Calculator do
  # See https://hexdocs.pm/elixir/Application.html
  # for more information on OTP Applications
  @moduledoc false


  def  percentage_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    Enum.random(1..100)
  end


  def letter_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    letter_grades = ["A", "B", "C", "D", "F"]
    Enum.take_random(letter_grades, 1)
  end

  def  numeric_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    Enum.random(1..100)
  end
end
