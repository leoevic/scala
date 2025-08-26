package week02.painter

enum CountryCode(val fullName: String):
  case AT extends CountryCode("Austria")
  case CH extends CountryCode("Switzerland")
  case DE extends CountryCode("Germany")
  case ES extends CountryCode("Spain")
  case FR extends CountryCode("France")
  case IT extends CountryCode("Italy")
  case NL extends CountryCode("Netherlands")
  case NO extends CountryCode("Norway")
  case US extends CountryCode("United States")
