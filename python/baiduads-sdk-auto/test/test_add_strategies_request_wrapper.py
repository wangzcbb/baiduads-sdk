"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.leadads.model.strategy_mod_request import StrategyModRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['StrategyModRequest'] = StrategyModRequest
from baiduads.leadads.model.add_strategies_request_wrapper import AddStrategiesRequestWrapper


class TestAddStrategiesRequestWrapper(unittest.TestCase):
    """AddStrategiesRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAddStrategiesRequestWrapper(self):
        """Test AddStrategiesRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AddStrategiesRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
